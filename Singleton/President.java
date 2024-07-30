public class President {
     // President sınıfının tek örneği
     private static President instance;

     // Başkanın adı
     private String name;
 
     // Özel yapıcı, böylece dışarıdan sınıfın örneği oluşturulamaz
     private President(String name) {
         this.name = name;
     }
 
     // Singleton örneğini dönen statik metot
     public static President getInstance(String name) {
         if (instance == null) {
             instance = new President(name);
         }
         return instance;
     }
 
     // Başkanın adını döner
     public String getName() {
         return name;
     }
 
     // Başkanın adını değiştirir
     public void setName(String name) {
         this.name = name;
     }
 
     // Başkanın bir konuşma yaptığını simüle eden metod
     public void makeSpeech() {
         System.out.println("I am " + name + ", the President of the country.");
     }
}
