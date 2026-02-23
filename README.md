Violación del SRP (Responsabilidad Única): La clase OrderManager no tiene una sola responsabilidad, ya que crea pedidos, calcula descuentos e impuestos, genera reportes, guarda en archivo y envía notificaciones. Esto hace que tenga varias razones para cambiar.

Violación del OCP (Abierto/Cerrado): La lógica de descuentos está dentro del método createOrder con condicionales. Si se quiere agregar un nuevo tipo de descuento, se debe modificar la clase en lugar de extenderla.

Violación del DIP (Inversión de Dependencias): La clase depende directamente de FileWriter y System.out.println, en lugar de usar interfaces. Esto genera alto acoplamiento y dificulta cambiar la forma de guardar o notificar.

Violación del ISP (Segregación de Interfaces): La clase agrupa funciones distintas como pedidos, impuestos y reportes, obligando a otros módulos a depender de métodos que pueden no necesitar.

Primer Checkpoint
<img width="1050" height="521" alt="image" src="https://github.com/user-attachments/assets/ff329467-f97a-46bf-a5a0-0ad04d74bd27" />
