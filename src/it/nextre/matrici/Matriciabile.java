package it.nextre.matrici;

public interface Matriciabile {
    public String get(int riga, int colonna);
    public void put(String value, int riga, int colonna);
    public boolean checkIndex(int riga, int colonna);
}
