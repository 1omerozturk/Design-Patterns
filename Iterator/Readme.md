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

Bu desenin genel amacı, farklı türde koleksiyonlar arasında gezinmeyi bir arayüzle soyutlamaktır. Bu sayede, koleksiyonun iç yapısına bağımlı olmadan öğeler arasında dolaşmak mümkün hale gelir.

Günlük hayattan bir örnek vermek gerekirse:

- Bir kütüphanedeki kitap raflarını düşünün. `ConcreteAggregate`, bu kitap raflarını temsil ederken, `ConcreteIterator` ise bu raflardaki kitaplar arasında gezinmenizi sağlar. `Client`, belirli bir rafın kitapları arasında gezinmek istediğinde `Iterator` arayüzünü kullanarak bu işlemi gerçekleştirir.

Bu örnek, Iterator deseninin koleksiyonlar arasında gezinti yapmayı nasıl soyutladığını ve uygulamayı nasıl kolaylaştırdığını gösterir.

<aside>
🔑 Örnek koda aşağıdaki linkten ulaşabilirsiniz:

</aside>

```csharp
https://github.com/1omerozturk/Design-Patterns/tree/main/Iterator
```

[Design-Patterns/Iterator at main · 1omerozturk/Design-Patterns](https://github.com/1omerozturk/Design-Patterns/tree/main/Iterator)