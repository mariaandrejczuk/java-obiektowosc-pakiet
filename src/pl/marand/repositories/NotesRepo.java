package pl.marand.repositories;

import pl.marand.Note;

import java.util.Arrays;

public class NotesRepo {
    private Note[] notes = new Note[10]; //ustawiam na sztywno 10, wiec nie potrzebuję konstruktora
    private int index = 0;

    public void add(Note note) {
        if (index >= notes.length) {  //pozbycie się błędu zwiazanego z wyjściem poza zakres tablicy = 10
            index = 0;
        }
        notes[index++] = note;
    }

    //wyświetlanie notatek --> toString --> alt insert --> index nie interesuje

    @Override
    public String toString() {
        return "NotesRepo{" +
                "notes=" + Arrays.toString(notes) +  //klasa Arrays ma w sobie metody dot tablic, m.in. wyświetlania, więc nie musimy robić pętli w tym celu
                '}';
    }
}
