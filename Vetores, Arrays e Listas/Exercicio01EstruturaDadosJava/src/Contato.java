public class Contato {

    private String name;
    private String email;
    private int number;

    public Contato(){}

    public Contato(String name, String email, int number) {
        this.name = name;
        this.email = email;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String toString() {
        StringBuilder data;
        data = new StringBuilder();

        data.append("Name: ").append(getName()).append("\n");
        data.append("Email: ").append(getEmail()).append("\n");
        data.append("Number: ").append(getNumber()).append("\n");

        return data.toString();
    }

}
