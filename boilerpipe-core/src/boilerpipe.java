import java.net.URL;
import java.util.Scanner;

import de.l3s.boilerpipe.extractors.ArticleExtractor;

class BoilerpipeCLI {
  public static void main(String[] args) throws Exception {
    
    String inputText = "";
    Scanner scanner = new Scanner(System.in);
    while (scanner.hasNextLine()) {
      inputText += scanner.nextLine()+"\n";
    }

    String output = ArticleExtractor.INSTANCE.getText(inputText);
  
    System.out.println(output);
  }
}