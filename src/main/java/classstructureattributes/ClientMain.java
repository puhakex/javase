package classstructureattributes;

public class ClientMain {
    public static void main(String[] args) {
        Client client = new Client();
        client.name = "John Doe";
        client.year = 1980;
        client.address = "Budapest";
        System.out.println(client.name);
        System.out.println(client.year);
        System.out.println(client.address);


    }
}
