import os
from pymongo import MongoClient, ASCENDING, DESCENDING
from dotenv import load_dotenv

load_dotenv()
URI = f"mongodb+srv://{os.getenv('MONGO_USER')}:{os.getenv('MONGO_PASS')}@{os.getenv('MONGO_CLUSTER')}.mongodb.net/"
client = MongoClient(URI)
col = client['videojuegos']['puntuaciones']

# 2. Insertar jugadores
col.insert_many([
    {'jugador': 'AlphaWolf', 'juego': 'Quake', 'puntos': 1200, 'nivel': 10, 'victorias': 8},
    {'jugador': 'ByteQueen', 'juego': 'Quake', 'puntos': 850, 'nivel': 7, 'victorias': 5},
    {'jugador': 'PixelKing', 'juego': 'Tetris', 'puntos': 620, 'nivel': 5, 'victorias': 3},
    {'jugador': 'NullPtr', 'juego': 'Tetris', 'puntos': 150, 'nivel': 2, 'victorias': 1},
    {'jugador': 'DataNinja', 'juego': 'Pong', 'puntos': 430, 'nivel': 4, 'victorias': 2},
    {'jugador': 'SyntaxError', 'juego': 'Pong', 'puntos': 90, 'nivel': 1, 'victorias': 0}
])

# 3. Top 3 
for p in col.find({}, {'_id':0}).sort('puntos', DESCENDING).limit(3): print(f"Top: {p}")

# 4. Incrementar puntos y victorias 
col.update_many({'puntos': {'$gt': 500}}, {'$inc': {'puntos': 100, 'victorias': 1}})

# 5. Doblar puntos del más victorioso ($mul) 
top_v = col.find_one(sort=[('victorias', DESCENDING)])
col.update_one({'_id': top_v['_id']}, {'$mul': {'puntos': 2}})

# 6. Eliminar < 200 puntos 
col.delete_many({'puntos': {'$lt': 200}})