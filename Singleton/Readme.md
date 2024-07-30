
### Singleton Design Pattern

- **Singleton**: Tekil, tekil kalıp anlamlarına gelmektedir.
- Nesne yaratımsal bir tasarım desenidir.
- Çok iş parçacıklıdır (multithreaded).
- Static Instance () { return uniqueInstance; }
- Static yapıdadır.
- **Amaç:** Bir sınıftan yalnızca bir nesnenin olması ve bu nesneye global erişim için bir nokta sağlanmasıdır.
- Yapılandırıcısı ⇒ `constructor` : `private` olarak tanımlanır.
- Genelde veri tabanı, konfigürasyon, logger vb. özel bilgileri içeren sınıflarda sadece bir noktadan erişim sağlamak gerektiğinden kullanılır.

Singleton Design Pattern UML diyagramı:

![singleton_desing_pattern.png](Singleton%20b1c1d9db80d446b4a0475f88daa4c911/singleton_desing_pattern.png)

Bu desen iki temel öğe içerir:

1. **Singleton Sınıfı**: Bu sınıf kendi örneğini oluşturur ve ona bir erişim noktası sağlar.
2. **Client**: Singleton sınıfının örneğini kullanır.
- **Singleton**: Singleton sınıfı, kendi örneğini saklayan statik bir `instance` değişkeni içerir. Bu sınıfın `getInstance()` metodu, sınıfın tek örneğini döner. Eğer örnek henüz oluşturulmadıysa, `getInstance()` metodu tarafından oluşturulur.
- **Client**: Singleton sınıfının örneğine erişir ve onu kullanır.

<aside>
🔑 Absract Factory design pattern örneğine aşağıdaki [**linkten](https://github.com/1omerozturk/Design-Patterns/tree/main/Singleton) [](https://github.com/1omerozturk/Design-Patterns/tree/main/Iterator)**ulaşabilirsiniz:

</aside>

```bash
https://github.com/1omerozturk/Design-Patterns/tree/main/Singleton
```

[](https://github.com/1omerozturk/Design-Patterns/tree/main/Singleton)

---

---