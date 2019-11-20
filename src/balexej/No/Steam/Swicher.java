package balexej.No.Steam;

public class Swicher {
public ElectricityConsumer consumer;

        public void switcherON()
    {
            System.out.println("Выключатель включен");
if (consumer != null)
    consumer.electricityOn();
        }
}


