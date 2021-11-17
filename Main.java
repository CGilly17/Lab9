import java.util.ArrayList;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;

class Main {
  static FileReader myFile;
  static ArrayList<Person> people;

  public static void main(String[] args) {

    people = new ArrayList<Person>();
    String name = "";
    String age = "";
    String color = "";

    people.add(new Person("CalLind", 22, "Cobalt"));
    people.add(new Person("A", 87, "Pink"));
    people.add(new Person("B", 13, "Yellow"));
    people.add(new Person("C", 55, "Black"));
    people.add(new Person("D", 4, "Green"));

    FileWriter toWriteFile;
    try {
      toWriteFile = new FileWriter("data.txt");
      BufferedWriter output = new BufferedWriter(toWriteFile);

      for (int i = 0; i < people.size(); i++) {
        output.write(people.get(i).getName());
        output.newLine();
        output.write(Integer.toString(people.get(i).getAge()));
        output.newLine();
        output.write(people.get(i).getColor());
        output.newLine();
        output.flush();
      }
      output.close();
    } catch (IOException excpt) {
      excpt.printStackTrace();
    }

    try {
      myFile = new FileReader("data.txt");
      BufferedReader reader = new BufferedReader(myFile);
      while (reader.ready()) {
        name = reader.readLine();
        age = reader.readLine();
        color = reader.readLine();
        System.out.printf("%-10s %-10s %-10s %n", name, age, color);
      }
      reader.close();

    } catch (IOException exception) {
      System.out.println(exception + " error has occurred.");
    }
  }
}
