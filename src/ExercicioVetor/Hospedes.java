package ExercicioVetor;

public class Hospedes {

    private String nomeDoHospede;
    private String email;
    private int room;

    public Hospedes(String nomeDoHospede, String email, int room) {
        this.nomeDoHospede = nomeDoHospede;
        this.email = email;
        this.room = room;
    }

    public String getNomeDoHospede() {
        return nomeDoHospede;
    }

    public void setNomeDoHospede(String nomeDoHospede) {
        this.nomeDoHospede = nomeDoHospede;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public String toString() {
        return room + ": " + nomeDoHospede + ", " + email;
    }
}
