package homeWork3.fileWrite;

public class WritePeople {

    public WritePeople(String lastName, String people) {
        String path = "src/main/java/homeWork3/persons/" + lastName + ".txt";
        new WriteTXT(path, people);
    }
}
