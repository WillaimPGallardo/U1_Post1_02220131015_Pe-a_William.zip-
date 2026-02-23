Violación del SRP (Responsabilidad Única): La clase OrderManager no tiene una sola responsabilidad, ya que crea pedidos, calcula descuentos e impuestos, genera reportes, guarda en archivo y envía notificaciones. Esto hace que tenga varias razones para cambiar.

Violación del OCP (Abierto/Cerrado): La lógica de descuentos está dentro del método createOrder con condicionales. Si se quiere agregar un nuevo tipo de descuento, se debe modificar la clase en lugar de extenderla.

Violación del DIP (Inversión de Dependencias): La clase depende directamente de FileWriter y System.out.println, en lugar de usar interfaces. Esto genera alto acoplamiento y dificulta cambiar la forma de guardar o notificar.

Violación del ISP (Segregación de Interfaces): La clase agrupa funciones distintas como pedidos, impuestos y reportes, obligando a otros módulos a depender de métodos que pueden no necesitar.

Primer Checkpoint
<img width="1050" height="521" alt="image" src="https://github.com/user-attachments/assets/ff329467-f97a-46bf-a5a0-0ad04d74bd27" />

Segundo Checkpoint: Las clases DiscountStrategy, StandardDiscount y VIPDiscount compilan 
correctamente.

<img width="682" height="406" alt="image" src="https://github.com/user-attachments/assets/349332c0-c228-496f-abe3-80e1a0ac304b" />
<img width="696" height="384" alt="image" src="https://github.com/user-attachments/assets/661d18de-2a23-44c6-94d3-4775f18ac76e" />
<img width="697" height="359" alt="image" src="https://github.com/user-attachments/assets/9f311990-2490-468c-bdb3-92d6f4711e04" />


Tercer Checkpoint: OrderService compila y funciona con las dependencias inyectadas. 
Pruebe con un main() que instancie todo. 

<img width="709" height="977" alt="image" src="https://github.com/user-attachments/assets/cb614393-3f05-4fd0-b9e9-a8483c3791ec" />

Cuarto Checkpoint: La aplicación compila y ejecuta mostrando la creación de 3 pedidos con 
diferentes estrategias de descuento. Tome captura de pantalla de la salida.

<img width="1912" height="1009" alt="image" src="https://github.com/user-attachments/assets/b38602d1-eb29-47c0-91bb-f6447af08415" />
