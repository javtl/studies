top_cryptos = ["Bitcoin","Ethereum","Solana"]
print(top_cryptos)

top_cryptos.append("Polkadot")
print(top_cryptos)

top_cryptos[1] = "Stable Coin"
print(top_cryptos)

eth = "Ethereum" in top_cryptos
print(eth)
print(len(top_cryptos))