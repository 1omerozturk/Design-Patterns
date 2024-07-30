public class Client {
    public static void main(String[] args) {
        // President sınıfının örneğine eriş
        President president1 = President.getInstance("John Doe");

        // President örneği ile bir metodu çağır
        president1.makeSpeech();

        // Aynı sınıf örneğine tekrar eriş ve adını değiştir
        President president2 = President.getInstance("Jane Doe");
        president2.makeSpeech();

        // İlk örnek ile tekrar bir metodu çağır
        president1.makeSpeech();
    }
}

