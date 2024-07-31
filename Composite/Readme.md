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

![Composite_Design_Pattern_UML.jpg](../images/composite.jpg)

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