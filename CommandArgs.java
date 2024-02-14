
public class CommandArgs {

  public static void main(String[] args) {
    if (args.length == 0) {
      System.out.println("No command line arguments were provided.");
    }

    for (int index = 0; index < args.length; index++) {
      System.out.println(
          String.format("%3d: %s", index, args[index]));
    }

  }
}