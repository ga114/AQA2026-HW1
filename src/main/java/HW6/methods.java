package HW6;

public class methods {
    public static class ExceptionHandler {

        private final double[] values = {12.5, 8.3, 0.0, 15.7};
        private final String[] labels = {"alpha", "beta", null, "gamma"};

        // Метод 1: базовый try-catch
        public void calculateRatio(double numerator, double divisor) {
            try {
                double x = numerator;
                double y = divisor;

                if (y == 0.0) {
                    throw new ArithmeticException("Division by zero detected");
                }

                double result = x / y;
                System.out.println("Результат: " + result);

            } catch (ArithmeticException ex) {
                System.err.println("[Ошибка вычисления] Деление на ноль недопустимо");
            }
        }

        // Метод 2: несколько catch блоков
        public void processData(int idx, String input) {
            try {
                double val = values[idx];
                String text = input;

                if (text == null) {
                    throw new NullPointerException("Empty reference");
                }

                int length = text.length();
                System.out.println("Длина строки: " + length);

                double inverse = 1.0 / val;
                System.out.println("Обратное значение: " + inverse);

            } catch (ArrayIndexOutOfBoundsException ex) {
                System.err.println("[Ошибка индекса] Указан несуществующий индекс массива");
            } catch (NullPointerException ex) {
                System.err.println("[Ошибка ссылки] Попытка доступа к null-объекту");
            }
        }

        // Метод 3: multi-catch
        public void validateEntry(int position, String data) {
            try {
                String entry = labels[position];
                double coefficient = values[position];

                if (entry == null) {
                    throw new NullPointerException("Missing label");
                }

                System.out.println("Запись: " + entry.toUpperCase());

                if (coefficient == 0.0) {
                    throw new ArithmeticException("Zero coefficient");
                }

                double scaled = 100.0 / coefficient;
                System.out.println("Масштабированное: " + scaled);

            } catch (ArrayIndexOutOfBoundsException | NullPointerException | ArithmeticException err) {
                System.err.println("[Критическая ошибка] Некорректные входные данные");
            }
        }

        // Метод 4: try-catch-finally
        public void executeOperation(int pointer, String payload) {
            boolean completed = false;

            try {
                String label = labels[pointer];
                double factor = values[pointer];

                if (label == null) {
                    throw new NullPointerException("Label is null");
                }

                System.out.println("Обработка: " + label);

                if (factor == 0.0) {
                    throw new ArithmeticException("Zero division attempt");
                }

                double output = 50.0 / factor;
                System.out.println("Вывод: " + output);
                completed = true;

            } catch (NullPointerException | ArithmeticException err) {
                System.err.println("[Сбой операции] " + err.getMessage());
            } finally {
                String status = completed ? "УСПЕХ" : "ОШИБКА";
                System.out.println("[Статус выполнения] Операция завершена с результатом: " + status);
            }
        }

    }
}
