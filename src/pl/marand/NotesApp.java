package pl.marand;

import pl.marand.repositories.NotesRepo;

import java.util.Scanner;

public class NotesApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "UTF-8");
        NotesRepo notesRepo = new NotesRepo();
        int option;

        do {
            System.out.println("---------Notes App ---------");
            System.out.println("1 - add notes");
            System.out.println("2 - display all");
            System.out.println("0 - stop");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Phone: ");
                    String phone = scanner.nextLine();

                    System.out.println("Date and time: ");
                    String dateTime = scanner.nextLine();

                    System.out.println("Description: ");
                    String description = scanner.nextLine();

                    Note note = new Note(phone, dateTime, description);
                    notesRepo.add(note);
                    break;
                case 2:
                    System.out.println(notesRepo); //domyślnie zostanie wywołana metoda toString na notesRepo
                    break;

            }
        } while (option != 0);
    }
}
