import java.util.Scanner;

public class main {
	
	public static int Sum( int number1, int number2) {
	    return number1 + number2; 
	}

    public static int Minus(int number1, int number2) {
    return number1 - number2; 
    }

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//     Контроль температуры		
//		
//		начало конец 
//		
//		int temperature = 35;
//		
//      if (temperature > 30) {
//			
//			System.out.println("Жарко");
//			
//		} else if (temperature >= 15) {
//			
//			System.out.println("Приятная погода");
//			
//		} else {
//			System.out.print("Холодно");
//		}
//		
//		конец 
//		
//		final boolean isWeekend = false;
//		final boolean isHoliday = true;
//		
//		 if (isWeekend || isHoliday) {
//	            System.out.println("Завтра выходной!");
//	        } else {
//	            System.out.println("Завтра рабочий день.");
//        } 
//		
//		int high = 100;
//		boolean yes = true;
//		
//		for (int i = 0; i <= high; i++) {
//			System.out.println(i + " От 1 до 100");
//		}
//		
//		while (yes) {
//			++high;
//			System.out.println(yes + " " + high);
//		}
//		
//		String input = "";
//
//		while (true) {
//		    System.out.println("Введите 'exit' для выхода:");
//		    input = scanner.nextLine();
//
//		    if (input.equals("exit")) {
//		        break;
//		    }
//		}
//		System.out.println("Цикл завершен оператором break.");
		
		String action;
		String sum = "+";
		String minus = "-";
	    
	    System.out.println("Ведите операцию что вы хотите сделать");
	    action = scanner.nextLine();
	    
//	   		 if (action == minus)
//	    Оператор == в Java используется для сравнения ссылок на объекты а не их фактического содержимого, а это спец. метод в спец. классе .equals()
	    
	    if (action.equals(sum)) {
	    	System.out.println("Введите числа чтоб их сложить");
	    	int result = Sum(scanner.nextInt(), scanner.nextInt()); 
		    System.out.println("Сумма: " + result);
		} else if (action.equals(minus)) {
			System.out.println("Введите числа чтоб их отнять");
			int result = Minus(scanner.nextInt(), scanner.nextInt()); 
		    System.out.println("Отнимание: " + result);
		} else {
			System.out.println("Вы ввели белеберду");
		}
	    
		

	}

}
