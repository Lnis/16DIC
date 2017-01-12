import java.io.File;
import java.io.IOException;


public class CreaFicheros {

	public static void main(String[] args) {
		File file=null;

	}

	public static void newFile(File file){
		
		try {
			if(!file.createNewFile()){
				System.out.println("Se ha creado el archivo");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
