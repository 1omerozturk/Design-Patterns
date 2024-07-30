
### Abstract Factory Design Pattern

- **Abstract:** soryut, **Factory:** fabrika, imalathane, yapımevi…
- Kit ( takım çantası, alet takımı ) diğer bilinen isimleridir.
- Factory Method deseni nesneleri üretir.
- Nesne yaratımsal desendir.
- **Amaç:** Somut sınıflarını belirtmeden bağlantılı ya da bağımlı olan nesneler grubunu yaratacak bir ara yüz sunmak.

Abstract Factory Design Pattern UML diyagramı: 

![https://miro.medium.com/v2/resize:fit:1400/1*pkGMrOjW8zXf1HAsjsrytA.png](https://miro.medium.com/v2/resize:fit:1400/1*pkGMrOjW8zXf1HAsjsrytA.png)

Bu UML diyagramı, **Abstract Factory** tasarım desenini göstermektedir. Abstract Factory deseni, ilgili nesnelerin ailelerini, onların somut sınıflarını belirtmeden oluşturmak için kullanılan bir creational (yaratıcı) tasarım desenidir. Bu desen, çeşitli ürünlerin oluşturulmasını soyutlamak ve istemcinin (client) hangi somut sınıfları kullandığını bilmesini engellemek için kullanılır.

Diyagramın ana bileşenleri ve işlevleri şu şekildedir:

1. **AbstractFactory**:
    - Ürün ailesinin her bir türünü oluşturmak için soyut yöntemler tanımlar. Örnekte, `CreateProductA()` ve `CreateProductB()` yöntemleri bulunmaktadır.
2. **ConcreteFactory1 ve ConcreteFactory2**:
    - `AbstractFactory` arayüzünü uygularlar ve her biri belirli ürün ailesinin somut nesnelerini oluşturur.
    - `ConcreteFactory1`, `ProductA1` ve `ProductB1` nesnelerini oluşturur.
    - `ConcreteFactory2`, `ProductA2` ve `ProductB2` nesnelerini oluşturur.
3. **AbstractProductA ve AbstractProductB**:
    - Ürün ailesindeki her bir ürün türü için ortak bir ara yüz tanımlarlar.
    - Örnekte, `AbstractProductA` ve `AbstractProductB` ürün türleri bulunmaktadır.
4. **ProductA1, ProductA2, ProductB1 ve ProductB2**:
    - `AbstractProductA` ve `AbstractProductB` ara yüzlerini uygularlar ve belirli somut ürünleri temsil ederler.
    - `ProductA1` ve `ProductA2`, `AbstractProductA` ara yüzünü uygular.
    - `ProductB1` ve `ProductB2`, `AbstractProductB` ara yüzünü uygular.
5. **Client (İstemci)**:
    - Abstract Factory ve Abstract Product ara yüzlerini kullanarak ürün ailelerinin nesnelerini oluşturur ve kullanır.
    - İstemci, hangi somut sınıfın kullanıldığını bilmez; sadece soyut arayüzleri kullanır.

### Günlük Hayattan Örnek:

Bir mobilya mağazası düşünün. Bu mağaza, farklı stillerde mobilyalar (modern, klasik) satıyor. Her stil, bir ürün ailesi (sandalye, masa) içerir.

- **AbstractFactory**: Mobilya Fabrikası
    - `CreateChair()`: Sandalye oluşturma metodu
    - `CreateTable()`: Masa oluşturma metodu
- **ConcreteFactory1**: Modern Mobilya Fabrikası
    - `CreateChair()`: Modern Sandalye oluşturur
    - `CreateTable()`: Modern Masa oluşturur
- **ConcreteFactory2**: Klasik Mobilya Fabrikası
    - `CreateChair()`: Klasik Sandalye oluşturur
    - `CreateTable()`: Klasik Masa oluşturur
- **AbstractProductA**: Sandalye ara yüzü
- **AbstractProductB**: Masa ara yüzü
- **ProductA1**: Modern Sandalye
- **ProductA2**: Klasik Sandalye
- **ProductB1**: Modern Masa
- **ProductB2**: Klasik Masa
- **Client**: Mobilya mağazası
    - Hangi tür mobilya (modern veya klasik) kullanılacağını belirler ve ilgili fabrika sınıfını kullanarak mobilya oluşturur.

Bu örnek, Abstract Factory deseninin nasıl çalıştığını ve farklı ürün ailelerinin nasıl oluşturulduğunu göstermektedir.

<aside>
🔑 Absract Factory design pattern örneğine aşağıdaki [**linkten](https://github.com/1omerozturk/Design-Patterns/tree/main/Abstract_Factory) [](https://github.com/1omerozturk/Design-Patterns/tree/main/Iterator)**ulaşabilirsiniz:

</aside>

```bash
https://github.com/1omerozturk/Design-Patterns/tree/main/Abstract_Factory
```

[Design-Patterns/Abstract_Factory at main · 1omerozturk/Design-Patterns](https://github.com/1omerozturk/Design-Patterns/tree/main/Abstract_Factory)

---

---

## Kod Açıklaması:

* ElectronicDeviceFactory: Soyut fabrika sınıfı, laptop ve telefon oluşturma yöntemlerini tanımlar.
* AppleFactory ve SamsungFactory: Soyut fabrikayı uygular ve Apple ile Samsung markalarının cihazlarını oluşturur.
* Laptop ve Phone: Soyut ürün arayüzleri, her bir cihaz türünün temel işlevlerini tanımlar.
* MacBook, GalaxyBook, iPhone, ve GalaxyPhone: Soyut ürün arayüzlerini uygulayan somut sınıflar.
* Client: Belirli bir fabrika sınıfını kullanarak cihazları oluşturur ve kullanır.

#### Bu örnek, Abstract Factory deseninin güncel hayatla nasıl ilişkilendirilebileceğini ve farklı markaların ürünlerini nasıl soyutlayarak oluşturabileceğimizi göstermektedir.
