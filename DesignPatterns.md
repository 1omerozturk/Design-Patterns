# Design Patterns

Yazılım geliştirme, karmaşık problemleri çözmek için kullanılan güçlü bir araçtır. Ancak bu güç, beraberinde karmaşıklık ve tekrar eden sorunları da getirir. İşte bu noktada **design patterns**  ( Tasarım Desenleri ) imdadımıza yetişir. Design patterns, yazılım tasarımında sıkça karşılaşılan sorunlara önceden belirlenmiş, test edilmiş ve tekrar kullanılabilir çözümler sunar. 

/Bu yazımda, design patterns’lerin ne olduğunu, neden önemli olduklarını, örneklerle birlikte daha derinlemesine inceleyeceğiz ve projelerinizde nasıl kullanabileceğinizi öğreneceksiniz  

**Ad**: isim olarak ingilizce kullanılacaktır.
**Sınıf: yaratımsal**, **yapısal**, **davranışsal**
**Amaç:** Daha iyi bir şekilde yazılım geliştirmek
**Yapı:** *OOP* üzerinde genellikle kullanılacaktır.
**Sonuçlar:** Örnek uygulamalar ile pekiştirmeler yapılacak.

Desen Sınıfları => **Yaratımsal,** **Yapısal**, **Davranışsal** olarak 3 sınıfa ayrılır.

## Yaratımsal Desenler

> - İlklendirmenin soyutlaştırılması ( interface, arayüz ),
- Sistem nesnelerinin yaratılmasından bağımsız hale gelmesi
- Sınıf ve nesne desenleri
- Nesnelerin ilklendirilmesi gizli
- Yaratımsal nesneler; Ne, kim, nasıl ve  ne zaman hakkında bilgiler verir.
> 
- Singelton
- Abstract
- Factory,
- Builder,
- Factory
- Method,
- Prototype

## Yapısal Desenler

> Sınıf ve nesneler  ile daha büyük yapıların oluşturulmasına odaklanır.
> 

> Kalıtım (inheritance) yerine bileşim (composition) tercih eder.
> 
- Adapter,
- Bridge,
- Composite,
- Decorator,
- Fecade,
- Flyweight,
- Proxy

## Davranışsal Desenler

> Algoritmaların ve nesneler arası sorumlulukların atanması ile ilgilidir.
> 
- Chain of Responsibility
- Command
- Interpreter
- Iterator
- Mediator
- Memento
- Observer
- State
- Strategy
- Template
- Visitor

---

---

### Iterator Design Pattern

Iterator: Yineleyici, tekrarlayıcı

Bilinen diğer adı **Cursor**; imleç

**Amaç:** Koleksiyonun alt yapısını teşhir etmeden elemanlarına sıralı erişim sağlamak

- Koleksiyonlarda farklı şekilde gezinmek mümkündür.
- Koleksiyona erişim ve gezinme sorumluluğu koleksiyondan *iterartor*’a geçiyor.
- **Nesne davranışsal** bir tasarım desenidir.
- Aşağıda bir Iterator design patterns UML diyagramı verilmiştir.

![https://www.oodesign.com/images/design_patterns/behavioral/iterator_implementation_-_uml_class_diagram.gif](https://www.oodesign.com/images/design_patterns/behavioral/iterator_implementation_-_uml_class_diagram.gif)

Bu UML sınıf diyagramı, **Iterator** tasarım desenini göstermektedir. Desenin ana bileşenleri şunlardır:

1. **Iterator (Gezgin) Arayüzü**:
    - `first()`: Koleksiyondaki ilk öğeyi döndürür.
    - `next()`: Koleksiyondaki bir sonraki öğeyi döndürür.
    - `isDone()`: Koleksiyonun sonuna gelinip gelinmediğini kontrol eder.
    - `currentItem()`: Geçerli öğeyi döndürür.
2. **ConcreteIterator (Somut Gezgin)**:
    - Bu sınıf, `Iterator` arayüzünü uygular ve koleksiyon üzerinde gezmeyi sağlayan yöntemlerin somut implementasyonlarını içerir.
    - `ConcreteIterator`, koleksiyondaki geçerli pozisyonu izlemek için genellikle bir indeks kullanır ve `Iterator` arayüzündeki yöntemleri bu indeks yardımıyla uygular.
3. **Aggregate (Toplayıcı) Arayüzü**:
    - `createIterator()`: Koleksiyon üzerinde iterasyon yapmayı sağlayacak bir `Iterator` nesnesi oluşturur.
4. **ConcreteAggregate (Somut Toplayıcı)**:
    - Bu sınıf, `Aggregate` arayüzünü uygular ve belirli bir koleksiyonun yönetimini yapar.
    - `ConcreteAggregate`, `createIterator()` yöntemini kullanarak kendisine ait bir `ConcreteIterator` oluşturur.
5. **Client (Müşteri)**:
    - `Iterator` ve `Aggregate` nesnelerini kullanarak koleksiyonlar üzerinde iterasyon yapar.

Bu desenin genel amacı, farklı türde koleksiyonlar arasında gezinmeyi bir ara yüzle soyutlamaktır. Bu sayede, koleksiyonun iç yapısına bağımlı olmadan öğeler arasında dolaşmak mümkün hale gelir.

Günlük hayattan bir örnek vermek gerekirse 🪢

- Bir kütüphanedeki kitap raflarını düşünün. `ConcreteAggregate`, bu kitap raflarını temsil ederken, `ConcreteIterator` ise bu raflardaki kitaplar arasında gezinmenizi sağlar. `Client`, belirli bir rafın kitapları arasında gezinmek istediğinde `Iterator` ara yüzünü kullanarak bu işlemi gerçekleştirir.

Bu örnek, Iterator deseninin koleksiyonlar arasında gezinti yapmayı nasıl soyutladığını ve uygulamayı nasıl kolaylaştırdığını gösterir.

<aside>
🔑 Iterator design pattern örneğine aşağıdaki [**linkten**](https://github.com/1omerozturk/Design-Patterns/tree/main/Iterator) ulaşabilirsiniz:

</aside>

```bash
https://github.com/1omerozturk/Design-Patterns/tree/main/Iterator
```

[Design-Patterns/Iterator at main · 1omerozturk/Design-Patterns](https://github.com/1omerozturk/Design-Patterns/tree/main/Iterator)

---

---

### Composite Design Pattern

- **Composite**: Bileşim, birçok parçadan oluşan demektir.
- Bu desen, nesneleri ağaç yapısında birleştirerek, bir bütünün parçalarını tek bir nesne gibi ele almayı sağlar. Böylece, istemci kodunun bu parçaların ayrı ayrı mı yoksa bir bütün mü olduğu konusunda endişelenmesine gerek kalmaz.
- özellikle hiyerarşik yapılarda; dosya sistemleri, organizasyon şemaları gibi, tekrar eden işlemlerde esneklik sağlar ve mevcut hiyerarşiyi değiştirmek kolaylaşır.

**Amaç:** Bütüne ve bütünün parçalarına aynı şekilde erişim sağlamak.

- Nesne yapısaldır.
- Pencere
    - Etiket
    - Metin satırı
    - Açılır menü
        - Düğme
        - Metin satırı

Bileşim içerisindeki tüm nesnelere aynı şekilde davranma.

**Composite** ( Bileşim ) tasarım deseni UML diyagramı.

![Composite_Design_Pattern_UML.jpg](Design%20Patterns%20500c060e26924d6380d9c84b9de845e4/Composite_Design_Pattern_UML.jpg)

Desenin ana bileşenleri şunlardır:

1. **Component (Bileşen) Arayüzü**:
    - `operation()`: Hem yaprak (leaf) hem de bileşik (composite) nesnelerde gerçekleştirilmesi gereken bir işlemi tanımlar.
2. **Leaf (Yaprak)**:
    - Bu sınıf, ağaç yapısının son düğümlerini temsil eder ve `Component` ara yüzünü uygular.
    - Yaprak düğümler, daha fazla alt düğüm içermez.
3. **Composite (Bileşik)**:
    - Bu sınıf, alt düğümlere (bileşenlere) sahip olan düğümleri temsil eder ve `Component` arayüzünü uygular.
    - Bileşik nesneler, hem yaprak hem de başka bileşik nesneleri içerebilir.
    - `operation()` yöntemi, tüm alt bileşenler üzerinde `operation()` yöntemini çağırır.
4. **Client (Müşteri)**:
    - `Component` arayüzünü kullanarak yaprak ve bileşik nesnelerle etkileşime girer.

Diyagramdaki iki ayrı bölüm bu yapıyı daha net anlamamızı sağlıyor:

- **Sol Taraftaki Sınıf Diyagramı**: Bu bölümde `Component`, `Leaf` ve `Composite` arasındaki ilişkiler ve `operation()` yönteminin nasıl tanımlandığı gösterilmektedir. Composite sınıfı, kendi çocuk bileşenlerini tutar ve `operation()` yöntemini her bir çocuk bileşen için çağırır.
- **Sağ Taraftaki Nesne İşbirliği Diyagramı**: Bu bölümde ise bir müşteri nesnesinin bir bileşik nesneye (`composite1`) eriştiği ve bu bileşik nesnenin alt bileşenlere (`leaf1`, `leaf2`, `composite2` gibi) nasıl erişim sağladığı gösterilmektedir. Bu yapı, bileşik nesnelerin alt bileşenleri üzerinde operasyonlar gerçekleştirebilmesi için kullanılır.

Deseni daha iyi anlamak için günlük hayattan örnek vermek gerekirse 🪢

- Bir şirketin organizasyon yapısını düşünün. `Component` arayüzü, her seviyedeki çalışanın gerçekleştirmesi gereken ortak operasyonları tanımlar (örneğin, rapor hazırlamak).
- `Leaf`, bireysel çalışanları (yaprak düğümleri) temsil eder.
- `Composite`, departmanları veya takımları (bileşik düğümleri) temsil eder.
- `Client`, şirketin CEO'su veya yöneticisi olabilir ve bu kişi, departmanların veya bireysel çalışanların operasyonlarını başlatabilir.

Bu desen, hiyerarşik yapıları yönetmeyi kolaylaştırır ve bireysel nesneler ile birleşik nesneler üzerinde aynı şekilde işlem yapma esnekliği sağlar.

- Composite design pattern *ebeveyn referansları,* *ortak yöntemler*, command deseni ile birlikte MacroCommand elde edilebilir.
- Decorator ile birlikte sıkça kullanılır.
- *Iterator* ile composite sınıflar gezilebilir.

<aside>
🔑 Composite design pattern örneğine aşağıdaki [**linkten**](https://github.com/1omerozturk/Design-Patterns/tree/main/Iterator) ulaşabilirsiniz:

</aside>

```bash
https://github.com/1omerozturk/Design-Patterns/tree/main/Composite
```

[Design-Patterns/Composite at main · 1omerozturk/Design-Patterns](https://github.com/1omerozturk/Design-Patterns/blob/main/Composite/)

---

---

### Command Design Pattern

- **Command**: Komut, emir anlamlarına gelir.
- Action (eylem ), Transaction (işlem) diğer bilinen adlarıdır.
- **Amaç**: Bir isteği ya da komutu, nesne olarak tanımlamak.
- İstek nesnesidir.
- Nesne davranışsaldır.

UML diyagramı verilen Command Design Pattern:

![command.gif](Design%20Patterns%20500c060e26924d6380d9c84b9de845e4/command.gif)

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

<aside>
🔑 Command design pattern örneğine aşağıdaki [**linkten](https://github.com/1omerozturk/Design-Patterns/tree/main/Command) [](https://github.com/1omerozturk/Design-Patterns/tree/main/Iterator)**ulaşabilirsiniz:

</aside>

```bash
https://github.com/1omerozturk/Design-Patterns/tree/main/Command
```

[Design-Patterns/Command at main · 1omerozturk/Design-Patterns](https://github.com/1omerozturk/Design-Patterns/tree/main/Command)

---

---

### State Design Pattern

- State: Durum, hal anlamlarına gelmektedir.
- **Amaç:** Bir nesnenin iç durumu değişince davranışının da değişmesinin sağlamak.
- Nesne davranışsaldır.
- If-else if yapısı örnek olabilir.
- Çok fazla durumun kontrol edilmesi zorlaşabilir bundan dolayı Finite State Machines, ( Sonlu durum makineleri ) kullanılır.

![https://www.allaboutcircuits.com/uploads/articles/state-diagram-circuit.jpg](https://www.allaboutcircuits.com/uploads/articles/state-diagram-circuit.jpg)

**State Design Pattern UML Diyagramı:**

![images.png](Design%20Patterns%20500c060e26924d6380d9c84b9de845e4/images.png)

Bu UML diyagramı, **State** (Durum) tasarım desenini göstermektedir. State deseni, bir nesnenin iç durumuna göre davranışını değiştirmesine olanak tanır. Bu desen, nesnenin durumlarını ve bu durumlara göre nasıl davrandığını soyutlar. State deseninin ana bileşenleri şunlardır:

1. **State (Durum) Arayüzü**:
    - `handle()`: Durum tarafından gerçekleştirilecek bir işlemi tanımlar. Bu yöntem, her bir somut durum (concrete state) tarafından farklı şekilde uygulanır.
2. **ConcreteStateA (Somut Durum A)** ve **ConcreteStateB (Somut Durum B)**:
    - `State` arayüzünü uygular ve belirli bir duruma özgü davranışları içerir.
    - Her bir somut durum, `handle()` yöntemini kendi durumu için özelleştirir.
3. **Context (Bağlam)**:
    - Mevcut durumu tutar ve duruma bağlı olarak davranışını değiştirir.
    - `request()`: İstemcinin çağırdığı yöntemdir ve bu yöntem mevcut duruma göre `handle()` yöntemini çağırır.

Diyagramın detayları:

- **Context**, mevcut durumu (`State` arayüzü) tutar ve istemciden (`Client`) gelen isteklere göre bu durumu yönetir.
- **State** arayüzü, `handle()` yöntemini tanımlar.
- **ConcreteStateA** ve **ConcreteStateB**, `State` arayüzünü uygular ve `handle()` yöntemini kendi durumlarına göre özelleştirir.
- **Context**, `request()` yöntemini çağırdığında, mevcut durumun `handle()` yöntemini çağırır ve böylece davranış, mevcut duruma göre belirlenir.

Günlük hayattan bir örnek vermek gerekirse:

- Bir trafik ışığını düşünün.
    - **State Arayüzü**, trafik ışığının farklı durumlarında (kırmızı, sarı, yeşil) yapılacak ortak işlemleri tanımlar.
    - **ConcreteStateA**, trafik ışığının kırmızı durumda olduğu bir durumu temsil eder ve bu durumda yapılacak işlemleri (örneğin, araçları durdurma) tanımlar.
    - **ConcreteStateB**, trafik ışığının yeşil durumda olduğu bir durumu temsil eder ve bu durumda yapılacak işlemleri (örneğin, araçları geçirme) tanımlar.
    - **Context**, trafik ışığının mevcut durumunu tutar ve duruma göre davranışını değiştirir (örneğin, kırmızıdan yeşile geçiş).

Bu desen, bir nesnenin davranışını durumuna göre değiştirmeyi ve bu durumları yönetmeyi kolaylaştırır. Özellikle, bir nesnenin iç durumuna bağlı olarak davranışının dinamik olarak değiştiği durumlarda kullanışlıdır.

<aside>
🔑 Command design pattern örneğine aşağıdaki [**linkten](https://github.com/1omerozturk/Design-Patterns/tree/main/State) [](https://github.com/1omerozturk/Design-Patterns/tree/main/Iterator)**ulaşabilirsiniz:

</aside>

```bash
https://github.com/1omerozturk/Design-Patterns/tree/main/State
```

[Design-Patterns/State at main · 1omerozturk/Design-Patterns](https://github.com/1omerozturk/Design-Patterns/tree/main/State)

---

---

### Factory Method Design Pattern

- **Factory:** Fabrika, imalathane, yapımevi; Method: yöntem
- Factory ⇒ Virtual Constructor - Sanal yapılandırıcı mahlaslarıdır.
- Sınıf yaratımsaldır.
- **Amaç:** Bir nesnenin yaratılması için tanımlanan ara yüzün altsınıflarına bu nesnenin hangi sınıftan olacağına karar verme hakkı sağlamaktır.

Factory Method Design Pattern UML diyagramı örneği: 

![Factory Method Design Pattern](Design%20Patterns%20500c060e26924d6380d9c84b9de845e4/example_of_factory_design_pattern.png)

Factory Method Design Pattern

Bu UML diyagramı, **Factory Method** tasarım desenini kullanarak araç üretimini modelleyen bir örneği göstermektedir. Bu desen, nesne oluşturma sürecini soyutlar ve alt sınıflara bırakır, böylece nesne oluşturma işlemi kolayca genişletilebilir ve değiştirilebilir hale gelir. Bu diyagramdaki bileşenler ve ilişkileri şöyle açıklanabilir:

1. **Vehicle (Araç) Soyut Sınıfı**:
    - `plateNumber`: Araçların plaka numarasını tutan bir özellik.
    - `stop()`: Araçların durması için bir yöntem.
    - `move()`: Araçların hareket etmesi için bir yöntem.
    - Bu soyut sınıf, `Car` ve `Truck` gibi alt sınıflar tarafından genişletilir.
2. **Car (Araba) ve Truck (Kamyon) Sınıfları**:
    - `Vehicle` soyut sınıfını genişletirler.
    - `stop()` ve `move()` yöntemlerini kendi özelliklerine göre uygularlar.
    - Her iki sınıf da `Vehicle` soyut sınıfından türetilmiştir ve kendi spesifik davranışlarını tanımlar.
3. **VehicleFactory (Araç Fabrikası) Sınıfı**:
    - `getVehicle(String vehicleType)`: Belirli bir araç türüne göre bir `Vehicle` nesnesi oluşturur ve döner.
    - Bu sınıf, araç oluşturma işlemini soyutlar ve istemciden (client) bağımsız hale getirir.
4. **VehicleFactoryDemo (Araç Fabrikası Demo) Sınıfı**:
    - `main()`: Programın çalıştırıldığı ana yöntemdir.
    - Bu sınıf, `VehicleFactory` sınıfını kullanarak belirli araç türlerini oluşturur ve araçların davranışlarını test eder.

Diyagramın detayları:

- **Vehicle** soyut sınıfı, tüm araçların ortak özelliklerini ve yöntemlerini tanımlar.
- **Car** ve **Truck** sınıfları, `Vehicle` soyut sınıfını genişleterek kendi spesifik davranışlarını uygular.
- **VehicleFactory** sınıfı, `getVehicle()` yöntemini kullanarak belirli araç türlerini oluşturur. Bu yöntem, istemciden (client) aldığı araç türüne göre (`vehicleType`), `Car` veya `Truck` nesnesi oluşturur.
- **VehicleFactoryDemo** sınıfı, `main()` yönteminde `VehicleFactory` sınıfını kullanarak belirli araç türlerini oluşturur ve bu araçların `stop()` ve `move()` yöntemlerini çağırarak test eder.

Günlük hayattan bir örnek vermek gerekirse:

- Bir araba kiralama şirketini düşünün.
    - **Vehicle** soyut sınıfı, tüm araçların (örneğin, arabalar ve kamyonlar) ortak özelliklerini (örneğin, plaka numarası) ve davranışlarını (örneğin, durma ve hareket etme) tanımlar.
    - **Car** ve **Truck** sınıfları, belirli araç türlerini temsil eder ve `Vehicle` soyut sınıfından türetilir.
    - **VehicleFactory** sınıfı, müşterinin (client) talebine göre belirli bir araç türünü oluşturur.
    - **VehicleFactoryDemo** sınıfı, belirli bir araç türünü oluşturmak ve test etmek için `VehicleFactory` sınıfını kullanır.

Bu desen, nesne oluşturma sürecini soyutlamak ve genişletilebilir hale getirmek için kullanılır. Özellikle, hangi nesne türünün oluşturulacağına dinamik olarak karar verilmesi gerektiğinde bu desen çok kullanışlıdır.

<aside>
🔑 Command design pattern örneğine aşağıdaki [**linkten](https://github.com/1omerozturk/Design-Patterns/tree/main/State) [](https://github.com/1omerozturk/Design-Patterns/tree/main/Iterator)**ulaşabilirsiniz:

</aside>

```bash
https://github.com/1omerozturk/Design-Patterns/tree/main/State
```

[Design-Patterns/Command at main · 1omerozturk/Design-Patterns](https://github.com/1omerozturk/Design-Patterns/tree/main/Command)

---

---