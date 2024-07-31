### Proxy Design Pattern

- **Proxy**: Vekil anlamına gelmektedir.
- Bilinen diğer isimleri: Surrogate
- Nesne yapısaldır.
- **Amaç:** Bir nesneye erişim kontrol etmek için o nesneye bir vekil nesne sağlamak.
- Proxy Design Pattern ⇒ ***Uzak Vekil**, **Sanal Vekil**, **Koruyucu Vekil***, ***Akıllı Referans***.

Proxy Design Pattern UML diyagramı:

![https://alkanfatih.com/wp-content/uploads/2023/02/proxy.png](../images/proxy.png)

Proxy deseninde üç ana bileşen bulunur:

1. **Subject**: Gerçek nesne ile proxy nesnesi arasındaki ortak arayüzdür.
2. **RealSubject**: Asıl işlevselliği gerçekleştiren gerçek nesnedir.
3. **Proxy**: Gerçek nesneye erişimi kontrol eden aracı nesnedir. RealSubject nesnesine referans tutar ve onun işlevselliğini çağırır.

**UML Diyagramı Açıklaması**

- **Client**: Subject arayüzünü kullanarak Proxy veya RealSubject nesnesine istekte bulunur.
- **Subject**: Ortak bir arayüzdür ve `Request` metodunu tanımlar.
- **RealSubject**: Subject arayüzünü uygular ve asıl işlevselliği gerçekleştiren nesnedir.
- **Proxy**: Subject arayüzünü uygular, RealSubject nesnesine bir referans tutar ve onun işlevselliğini kontrol eder.

Proxy Design pattern günlük hayat örneği:

Proxy tasarım deseni için güncel hayat örneği olarak "***banka hesabına erişim***" senaryosunu ele alalım. Banka hesabı gerçek nesne (RealSubject), müşteri temsilcisi proxy, ve müşteri ise client olarak düşünülebilir. Müşteri, müşteri temsilcisine (proxy) ulaşarak banka hesabındaki işlemleri gerçekleştirmek ister. Müşteri temsilcisi, müşterinin kimliğini doğrular ve uygun olduğu takdirde işlemi gerçekleştirmek için banka hesabına erişim sağlar.

🔑 Proxy design pattern örneğine aşağıdaki [linkten](https://github.com/1omerozturk/Design-Patterns/tree/main/Observer) ulaşabilirsiniz:

```bash
https://github.com/1omerozturk/Design-Patterns/tree/main/Proxy
```
