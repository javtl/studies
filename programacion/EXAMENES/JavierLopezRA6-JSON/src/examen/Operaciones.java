package examen;

	import java.io.BufferedReader;
	import java.io.BufferedWriter;
	import java.io.FileNotFoundException;
	import java.io.FileReader;
	import java.io.FileWriter;
	import java.io.IOException;

	public class Operaciones {
		//Definir dos métodos estáticos
		//leerFichero(String nombre) Devuelve una cadena 
		//con la lectura del fichero
		public static String leerFichero(String fich)
		{
			String info="";
			try(BufferedReader br=new BufferedReader(new FileReader(fich)))
			{
				String linea;
				while((linea=br.readLine())!=null) {
					info+=linea;
				}
			}catch(FileNotFoundException ex) {
				System.out.println(ex.getMessage());
			} catch(IOException ex) {
				System.out.println(ex.getMessage());
			}
			return info;
		}
		
		public static void escribirFichero(String info, String ruta)
		{
			try(BufferedWriter bw=new BufferedWriter(new FileWriter(ruta))){
				bw.write(info);
				System.out.println("Fichero creado");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	
