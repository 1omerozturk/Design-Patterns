### Observer Design Pattern

- **Observer**: Gözlemci, izelyici anlamlarına gelmektedir.
- Bilinen diğer isimleri: Dependents:bağımlılar, Publish-Subscribe: Yayınla-Abonel ol
- Nesne davranışsaldır.
- **Amaç:** Nesneler arasında birden-çoka ( one-to-many ) bağımlılık tanımla ve bir nesne durum değiştirdiğinde bağımlı olanların otomatik güncellenmesini sağlamaktır. ( Bildirim yapıları vs olabilir. )

Observer Design Pattern UML diyagramı:

![https://www.dofactory.com/img/diagrams/net/observer.png](https://www.dofactory.com/img/diagrams/net/observer.png)

![https://www.researchgate.net/publication/224198176/figure/fig2/AS:667774309388288@1536221210042/Observer-pattern-running-example.png](https://www.researchgate.net/publication/224198176/figure/fig2/AS:667774309388288@1536221210042/Observer-pattern-running-example.png)

![https://www.notion.soSingleton%20b1c1d9db80d446b4a0475f88daa4c911/singleton_desing_pattern.png](https://www.notion.soSingleton%20b1c1d9db80d446b4a0475f88daa4c911/singleton_desing_pattern.png)

![https://www.researchgate.net/publication/224198176/figure/fig2/AS:667774309388288@1536221210042/Observer-pattern-running-example.png](https://www.researchgate.net/publication/224198176/figure/fig2/AS:667774309388288@1536221210042/Observer-pattern-running-example.png)

Observer tasarım deseni dört ana bileşenden oluşur:

1. **Subject (Konu)**: Gözlemlenen nesnedir. Bir dizi gözlemciyi (observers) tutar ve durumu değiştiğinde onları bilgilendirir.
2. **Observer (Gözlemci)**: Subject'in durumundaki değişiklikler hakkında bilgilendirilen nesnedir.
3. **ConcreteSubject (Somut Konu)**: Subject arayüzünü uygular ve durumu saklar. ConcreteObserver nesnelerine bildirimler gönderir.
4. **ConcreteObserver (Somut Gözlemci)**: Observer arayüzünü uygular ve Subject'in durumunu senkronize eder.

UML Diyagramı Açıklaması

- **Subject**: Observer nesnelerini ekleme (`Attach`), çıkarma (`Detach`), ve bilgilendirme (`Notify`) işlevlerini tanımlar.
- **Observer**: Subject'in durum değişiklikleri hakkında bilgi almak için `Update` işlevini tanımlar.
- **ConcreteSubject**: Subject arayüzünü uygular ve durumu saklar. `GetState` işlevi ile durumu döner.
- **ConcreteObserver**: Observer arayüzünü uygular ve Subject'in durumunu senkronize eder. `Update` işlevi ile Subject'ten güncellenmiş durumu alır.

🔑 Absract Factory design pattern örneğine aşağıdaki [linkten](https://github.com/1omerozturk/Design-Patterns/tree/main/Observer) ulaşabilirsiniz:

```bash
https://github.com/1omerozturk/Design-Patterns/tree/main/Observer
```
