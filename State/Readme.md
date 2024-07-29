
### State Design Pattern

- State: Durum, hal anlamlarına gelmektedir.
- **Amaç:** Bir nesnenin iç durumu değişince davranışının da değişmesinin sağlamak.
- Nesne davranışsaldır.
- If-else if yapısı örnek olabilir.
- Çok fazla durumun kontrol edilmesi zorlaşabilir bundan dolayı Finite State Machines, ( Sonlu durum makineleri ) kullanılır.

![https://www.allaboutcircuits.com/uploads/articles/state-diagram-circuit.jpg](https://www.allaboutcircuits.com/uploads/articles/state-diagram-circuit.jpg)

**State Design Pattern UML Diyagramı:**

![images.png](https://www.google.com/url?sa=i&url=https%3A%2F%2Fen.wikipedia.org%2Fwiki%2FState_pattern&psig=AOvVaw1OOTVnWBqfF35OYT88C1iB&ust=1722365676343000&source=images&cd=vfe&opi=89978449&ved=0CBEQjRxqFwoTCKiSkaz2zIcDFQAAAAAdAAAAABAE)

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
