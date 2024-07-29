
### Command Design Pattern

- **Command**: Komut, emir anlamlarına gelir.
- Action (eylem ), Transaction (işlem) diğer bilinen adlarıdır.
- **Amaç**: Bir isteği ya da komutu, nesne olarak tanımlamak.
- İstek nesnesidir.
- Nesne davranışsaldır.

UML diyagramı verilen Command Design Pattern:

![command.png](https://miro.medium.com/v2/resize:fit:1200/1*lN94pwMoBbW-EwLHOEFn7g.gif)

Bu UML diyagramı, **Command** (Komut) tasarım desenini,  bir işlemi (komutu) nesne olarak temsil etmeyi sağlar. Bu desen, işlemleri parametrik hale getirir ve işlemler arasında geri al (*undo*) ve yeniden yap (*redo*) gibi işlemleri desteklemeyi kolaylaştırır. 

Command deseninin ana bileşenleri şunlardır:

1. **Command Arayüzü**:
    - `Execute()`: Bir komutu çalıştırmak için kullanılan yöntemdir. Bu ara yüz, tüm komutların uygulaması gereken ortak bir yöntemi tanımlar.
2. **ConcreteCommand (Somut Komut)**:
    - `Command` arayüzünü uygular ve belirli bir işlemi gerçekleştirir.
    - Bu sınıf, işlemi gerçekleştirmek için gerekli olan durumu ve alıcı (*receiver*) nesnesini içerir.
    - `Execute()` yöntemi, alıcı nesnede (*receiver*) tanımlı olan belirli bir işlemi çağırır.
3. **Receiver (Alıcı)**:
    - Gerçek iş mantığını içeren sınıftır. Bu sınıf, komut tarafından çağrılan işlemleri gerçekleştirir.
    - `Action()`: Alıcının gerçekleştirdiği işlemdir.
4. **Invoker (Çağırıcı)**:
    - Komutun ne zaman çalıştırılacağını belirler. Komutun çalıştırılmasından sorumludur.
    - Çağırıcı, komut nesnesini tutar ve `Execute()` yöntemini çağırarak komutun çalışmasını sağlar.
5. **Client (Müşteri)**:
    - Komut nesnelerini oluşturur ve gerekli parametrelerle ayarlar.
    - Müşteri, komut nesnelerini oluşturur ve çağırıcıya iletir.

Diyagramın detayları:

- **Client**, belirli bir `ConcreteCommand` oluşturur ve bu komutu `Invoker`'a iletir.
- **Invoker**, kendisine iletilen komutu (`Command`) çalıştırmaktan sorumludur ve `Execute()` yöntemini çağırır.
- **ConcreteCommand**, komutu çalıştırdığında `Receiver` nesnesinin `Action()` yöntemini çağırır.
- **Receiver**, asıl iş mantığını içerir ve `Action()` yöntemi ile belirli bir işlemi gerçekleştirir.

Günlük hayattan bir örnek vermek gerekirse: 🪢

- Bir televizyon kumandasını düşünün.
    - **Command Arayüzü**, tüm komutların (örneğin, televizyonu açma, kapama, ses seviyesini artırma) uygulaması gereken ortak bir ara yüzdür.
    - **ConcreteCommand**, belirli bir komutun (örneğin, televizyonu açma) uygulamasıdır.
    - **Receiver**, televizyonun kendisidir ve belirli işlemleri (örneğin, televizyonu açma) gerçekleştirir.
    - **Invoker**, kumandanın kendisidir ve hangi butona basıldığında hangi komutun çalıştırılacağını belirler.
    - **Client**, kumandayı programlayan ve hangi butonun hangi komutu çalıştıracağını belirleyen kişidir.

Bu desen, işlemleri soyutlamak ve komutları parametrik hale getirmek için kullanılır. Özellikle geri al ve yeniden yap işlemlerinin gerektiği durumlarda çok kullanışlıdır.