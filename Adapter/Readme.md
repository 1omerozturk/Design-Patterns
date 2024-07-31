### Adapter Design Pattern

- **Adapter:** Adaptör, uyarlayan anlamlarına gelmektedir.
- Diğer isimleri: Wrapper, sarmalayan, saran.
- **Amaç:** Bir sınıfın ara yüzünü, istemcilerin beklediği ara yüze dönüştürmek.
- Uyumsuzluk problemlerini önlemek için kullanılır.
- Hem sınıf hem de nesne yapısal bir tasarım desenidir.

![https://upload.wikimedia.org/wikipedia/commons/e/e5/W3sDesign_Adapter_Design_Pattern_UML.jpg](../images/adapter.jpg)

- Adapter deseni, sınıfların birlikte çalışmasını sağlarken, var olan kodun değiştirilmesine gerek kalmadan, arayüzlerin uyumsuzluklarını giderir.

Adapter deseninde dört ana bileşen bulunur:

1. **Client (İstemci)**: Adapt edilmiş arayüzü kullanarak çalışır.
2. **Target (Hedef)**: İstemcinin çalışmak istediği arayüz.
3. **Adaptee (Uyarlanan)**: Adapt edilmesi gereken mevcut sınıf.
4. **Adapter**: Adaptee'yi Target arayüzüne uyarlayan sınıf.
- Günlük hayat örneği:
    
    Bir şarj cihazı (Adapter) aracılığıyla bir cep telefonunu (Client) eski tip priz (Adaptee) ile şarj etmeyi örnek olarak verebiliriz. Hayatımızda fark etmeden en fazla kullandığımız yapılardan biridir Adapter ( dönüştürücü ) yapıları. 
    

<aside>
🔑 Adapter design pattern örneğine aşağıdaki [**linkten](https://github.com/1omerozturk/Design-Patterns/tree/main/Adapter) [](https://github.com/1omerozturk/Design-Patterns/tree/main/Iterator)**ulaşabilirsiniz:

</aside>

```bash
https://github.com/1omerozturk/Design-Patterns/tree/main/Adapter
```
