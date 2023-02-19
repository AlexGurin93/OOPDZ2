
import java.util.Scanner;
public class SaveDocument {

    public abstract class SaveDocument {
        Scanner scan = new Scanner(System.in);

        public SaveDocument() {
            this.scan = new Scanner(System.in);
        }

        abstract void LineSaveDoс(String puthDoc, String nameDoc, String line);
        abstract void EnterSaveDoс(String puthDoc, String nameDoc);
    }
}
