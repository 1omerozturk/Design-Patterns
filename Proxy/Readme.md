### Proxy Design Pattern

- **Proxy**: Vekil anlamına gelmektedir.
- Bilinen diğer isimleri: Surrogate
- Nesne yapısaldır.
- **Amaç:** Bir nesneye erişim kontrol etmek için o nesneye bir vekil nesne sağlamak.
- Proxy Design Pattern ⇒ ***Uzak Vekil**, **Sanal Vekil**, **Koruyucu Vekil***, ***Akıllı Referans***.

Proxy Design Pattern UML diyagramı:

![https://alkanfatih.com/wp-content/uploads/2023/02/proxy.png](https://alkanfatih.com/wp-content/uploads/2023/02/proxy.png)

![https://www.researchgate.net/publication/224198176/figure/fig2/AS:667774309388288@1536221210042/Observer-pattern-running-example.png](https://www.researchgate.net/publication/224198176/figure/fig2/AS:667774309388288@1536221210042/Observer-pattern-running-example.png)

![https://www.notion.soSingleton%20b1c1d9db80d446b4a0475f88daa4c911/singleton_desing_pattern.png](https://www.notion.soSingleton%20b1c1d9db80d446b4a0475f88daa4c911/singleton_desing_pattern.png)

![https://www.researchgate.net/publication/224198176/figure/fig2/AS:667774309388288@1536221210042/Observer-pattern-running-example.png](https://www.researchgate.net/publication/224198176/figure/fig2/AS:667774309388288@1536221210042/Observer-pattern-running-example.png)

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
