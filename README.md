# Design Patterns

Yazılım geliştirme, karmaşık problemleri çözmek için kullanılan güçlü bir araçtır. Ancak bu güç, beraberinde karmaşıklık ve tekrar eden sorunları da getirir. İşte bu noktada **design patterns**  ( Tasarıım Desenleri ) imdadımıza yetişir. Design patterns, yazılım tasarımında sıkça karşılaşılan sorunlara önceden belirlenmiş, test edilmiş ve tekrar kullanılabilir çözümler sunar. 

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

Günlük hayattan bir örnek vermek gerekirse:

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

![Composite_Design_Pattern_UML.jpg](https://upload.wikimedia.org/wikipedia/commons/6/65/W3sDesign_Composite_Design_Pattern_UML.jpg)

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

Deseni daha iyi anlamak için günlük hayattan örnek vermek gerekirse;

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