package _10_OOP;

public class Fraction {
    private int numerator;
    private int denominator;
    private boolean isValid;

    public Fraction(int numerator, int denominator){
        this.numerator = numerator;
        if(denominator == 0) {
            this.isValid = false;
        } else {
            this.isValid = true;
            this.denominator = denominator;
        }
    }

    // Phương thức rút gọn phân số
    public void reduce(){
        if(!isValid) {
            System.out.println("Cannot reduce the fraction!");
        } else {
            int gcd = gcd(numerator, denominator);
            this.numerator /= gcd;
            this.denominator /= gcd;
        }
    }

    //  Phương thức trả về giá trị phân số dưới dạng chuỗi
    @Override
    public String toString(){
        if(!isValid)
            return "Invalid fraction!";
        return numerator + "/" + denominator;
    }

    // Phương thức cộng phân số khác
    public Fraction add(Fraction f){
        if(!this.isValid || !f.isValid){
            System.out.println("Cannot add because one of this two fraction is invalid!");
            return null;
        } else {
            int newNumerator = this.numerator * f.getDenominator()
                    + f.getNumerator() * this.getDenominator();
            int newDenominator = this.denominator * f.getDenominator();

            Fraction result = new Fraction(newNumerator, newDenominator);
            result.reduce();

            return result;
        }
    }

    // Phương thức trừ phân số khác
    public Fraction subtract(Fraction f){
        if(!this.isValid || !f.isValid) {
            System.out.println("Cannot subtract because one of this two fraction is invalid!");
            return null;
        } else {
            int newNumerator = this.numerator * f.getDenominator()
                    - f.getNumerator() * this.getDenominator();
            int newDenominator = this.denominator * f.getDenominator();

            Fraction result = new Fraction(newNumerator, newDenominator);
            result.reduce();

            return result;
        }

    }

    // Phương thức nhân phân số khác
    public Fraction multiply(Fraction f){
        if(!this.isValid || !f.isValid) {
            System.out.println("Cannot multiply because one of this two fraction is invalid!");
            return null;
        } else {
            int newNumerator = this.numerator * f.getNumerator();
            int newDenominator = this.denominator * f.getDenominator();
            Fraction result = new Fraction(newNumerator, newDenominator);
            result.reduce();

            return result;
        }


    }

    // Phương thức chia phân số khác
    public Fraction divide(Fraction f){
        if(!this.isValid || !f.isValid) {
            System.out.println("Cannot subtract because one of this two fraction is invalid!");
            return null;
        } else {
            int newNumerator = this.numerator * f.getDenominator();
            int newDenominator = this.denominator * f.getNumerator();
            Fraction result = new Fraction(newNumerator, newDenominator);
            result.reduce();

            return result;
        }
    }

    private int gcd(int numerator, int denominator){
        if(denominator == 0)
            return numerator;

        return gcd(denominator, numerator%denominator);
    }


    public int getNumerator() {
        return numerator;
    }


    public int getDenominator() {
        return denominator;
    }


    public static void main(String[] args) {
        Fraction f1 = new Fraction(4, 6);
        Fraction f2 = new Fraction(5, 0);
        Fraction f3 = new Fraction(1, 2);

        System.out.println("Fraction f1 before reduce: " + f1);
        f1.reduce();
        System.out.println("Fraction f1 after reduce: " + f1);
        System.out.println("-------------------------------------------------");

        System.out.println("Operation of two fraction " + f1 + " and " + f3);
        System.out.println("Sum: " + f1.add(f3));
        System.out.println("Difference: " + f1.subtract(f3));
        System.out.println("Product: " + f1.multiply(f3));
        System.out.println("Quotient: " + f1.divide(f3));
        System.out.println("-------------------------------------------------");

        System.out.println("Operation of two fraction " + f2 + " and " + f3);
        System.out.println("Sum: " + f2.add(f3));
        System.out.println("Difference: " + f2.subtract(f3));
        System.out.println("Product: " + f2.multiply(f3));
        System.out.println("Quotient: " + f2.divide(f3));
    }

    /*
Giải thích cách giải bài tập:

1. **Khai báo lớp Fraction**:
   - Lớp `Fraction` có hai thuộc tính riêng tư `numerator` (tử số) và `denominator` (mẫu số) để biểu diễn một phân số.
   - Thuộc tính `isValid` kiểm tra xem phân số có hợp lệ hay không (mẫu số không được bằng 0).

2. **Constructor**:
   - Nhận vào tử số và mẫu số khi khởi tạo.
   - Nếu mẫu số bằng 0, đánh dấu phân số là không hợp lệ (`isValid = false`).
   - Ngược lại, lưu giá trị của tử số và mẫu số.

3. **Phương thức rút gọn phân số (`reduce`)**:
   - Sử dụng thuật toán `gcd` (Ước chung lớn nhất) để tìm ước số chung của tử số và mẫu số.
   - Chia tử số và mẫu số cho `gcd` để đưa phân số về dạng tối giản.

4. **Phương thức chuyển đổi phân số thành chuỗi (`toString`)**:
   - Nếu phân số không hợp lệ, trả về thông báo `"Invalid fraction!"`.
   - Nếu hợp lệ, trả về chuỗi dạng `"numerator/denominator"`.

5. **Các phép toán trên phân số**:
   - Trước khi thực hiện phép toán, kiểm tra xem cả hai phân số có hợp lệ hay không.
   - Kết quả được rút gọn trước khi trả về.

6. **Thuật toán `gcd`**:
   - Sử dụng thuật toán Euclid để tìm ước số chung lớn nhất (`gcd`), cần thiết cho việc rút gọn phân số.

7. **Chương trình chính (`main`)**:
   - Khởi tạo các phân số và thử nghiệm các phép toán trên chúng.
   - Kiểm tra trường hợp phân số hợp lệ và không hợp lệ.
   - In ra kết quả trước và sau khi rút gọn phân số.

*/

}