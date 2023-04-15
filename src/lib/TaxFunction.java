package lib;

// public class TaxCalculator { 
// 'pergantian nama function jadi calculator agar sesuai dengan fungsi dari java tersebut
// karena maenurut sya ini sebenernya untuk perhitungan pajak '

private static final int MAX_CHILDREN = 3; // Maksimal jumlah batasannya 3, jika diatas 3 maka akan tertera 3 saja
private static final int SINGLE_DEDUCTIBLE = 54000000; // ya dengan dengan nilai 54000000, digunakan untuk menghitung penghasilan 
														// tidak kena pajak bagi pegawai yang belum menikah dan belum memiliki anak.
private static final int MARRIED_DEDUCTIBLE = 58500000; // dengan nilai 58500000, digunakan untuk menghitung penghasilan tidak kena pajak bagi pegawai yang sudah menikah.
private static final int CHILD_DEDUCTIBLE = 4500000; // dengan nilai 4500000, digunakan untuk menghitung penghasilan tidak kena pajak 
													//bagi setiap anak yang dimiliki pegawai, dengan maksimum 3 anak., dan fungsi ini ada ngaruhnya dengan Max_Children 
													// saat penggunaan

'Menurut saya, sebenernya fungsi ini untuk menunjjukan perubahan pada pada pajak penghasilan didalam Class TaxFunction
yang menjadi TaxCalculaator'

// 	 public static int calculateTax(int monthlySalary, int otherMonthlyIncome, int numberOfMonthWorking, int deductible, boolean isMarried, int numberOfChildren) {
		
// 		int tax = 0;
		
// 		if (numberOfMonthWorking > 12) {
// 			System.err.println("More than 12 month working per year");
// 		}
		
// 		if (numberOfChildren > 3) {
// 			numberOfChildren = 3;
// 		}
		
// 		if (isMarried) {
// 			tax = (int) Math.round(0.05 * (((monthlySalary + otherMonthlyIncome) * numberOfMonthWorking) - deductible - (54000000 + 4500000 + (numberOfChildren * 1500000))));
// 		}else {
// 			tax = (int) Math.round(0.05 * (((monthlySalary + otherMonthlyIncome) * numberOfMonthWorking) - deductible - 54000000));
// 		}
		
// 		if (tax < 0) {
// 			return 0;
// 		}else {
// 			return tax;
// 		}
			 
// 	}
	
// }
