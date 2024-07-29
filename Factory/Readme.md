
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
