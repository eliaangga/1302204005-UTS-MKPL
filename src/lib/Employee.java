package lib;

import java.time.LocalDate;
import java.time.Month;
import java.util.LinkedList;
import java.util.List;

<<<<<<< Updated upstream
public class Employee {

	private String employeeId;
	private String firstName;
	private String lastName;
	private String idNumber;
	private String address;
	
	private int yearJoined;
	private int monthJoined;
	private int dayJoined;
	private int monthWorkingInYear;
	
	private boolean isForeigner;
	private boolean gender; //true = Laki-laki, false = Perempuan
	
	private int monthlySalary;
	private int otherMonthlyIncome;
	private int annualDeductible;
	
	private String spouseName;
	private String spouseIdNumber;

	private List<String> childNames;
	private List<String> childIdNumbers;
	
	public Employee(String employeeId, String firstName, String lastName, String idNumber, String address, int yearJoined, int monthJoined, int dayJoined, boolean isForeigner, boolean gender) {
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = idNumber;
		this.address = address;
		this.yearJoined = yearJoined;
		this.monthJoined = monthJoined;
		this.dayJoined = dayJoined;
		this.isForeigner = isForeigner;
		this.gender = gender;
		
		childNames = new LinkedList<String>();
		childIdNumbers = new LinkedList<String>();
	}
	
	/**
	 * Fungsi untuk menentukan gaji bulanan pegawai berdasarkan grade kepegawaiannya (grade 1: 3.000.000 per bulan, grade 2: 5.000.000 per bulan, grade 3: 7.000.000 per bulan)
	 * Jika pegawai adalah warga negara asing gaji bulanan diperbesar sebanyak 50%
	 */
	
	public void setMonthlySalary(int grade) {	
		if (grade == 1) {
			monthlySalary = 3000000;
			if (isForeigner) {
				monthlySalary = (int) (3000000 * 1.5);
			}
		}else if (grade == 2) {
			monthlySalary = 5000000;
			if (isForeigner) {
				monthlySalary = (int) (3000000 * 1.5);
			}
		}else if (grade == 3) {
			monthlySalary = 7000000;
			if (isForeigner) {
				monthlySalary = (int) (3000000 * 1.5);
			}
		}
	}
	
	public void setAnnualDeductible(int deductible) {	
		this.annualDeductible = deductible;
	}
	
	public void setAdditionalIncome(int income) {	
		this.otherMonthlyIncome = income;
	}
	
	public void setSpouse(String spouseName, String spouseIdNumber) {
		this.spouseName = spouseName;
		this.spouseIdNumber = idNumber;
	}
	
	public void addChild(String childName, String childIdNumber) {
		childNames.add(childName);
		childIdNumbers.add(childIdNumber);
	}
	
	public int getAnnualIncomeTax() {
		
		//Menghitung berapa lama pegawai bekerja dalam setahun ini, jika pegawai sudah bekerja dari tahun sebelumnya maka otomatis dianggap 12 bulan.
		LocalDate date = LocalDate.now();
		
		if (date.getYear() == yearJoined) {
			monthWorkingInYear = date.getMonthValue() - monthJoined;
		}else {
			monthWorkingInYear = 12;
		}
		
		return TaxFunction.calculateTax(monthlySalary, otherMonthlyIncome, monthWorkingInYear, annualDeductible, spouseIdNumber.equals(""), childIdNumbers.size());
	}
}
=======
// public class Employee {
//     private static final int MONTH_IN_YEAR = 12;
//     private static final int GRADE_1_SALARY = 3000000;
//     private static final int GRADE_2_SALARY = 5000000;
//     private static final int GRADE_3_SALARY = 7000000;
    
// 	private String employeeId;
// 	private String firstName;
// 	private String lastName;
// 	private String idNumber;
// 	private String address;
// 	private LocalDate dateJoined;
// 	private boolean isForeigner;
// 	private boolean isMale;
// 	private int monthlySalary;
// 	private int otherMonthlyIncome;
// 	private int annualDeductible;
// 	private String spouseName;
// 	private String spouseIdNumber;
// 	private List<String> childNames;
// 	private List<String> childIdNumbers;
	
// 	public Employee(String employeeId, String firstName, String lastName, String idNumber, String address, LocalDate dateJoined, boolean isForeigner, boolean isMale) {
// 	    if (firstName == null || lastName == null || idNumber == null || dateJoined == null) {
//             throw new IllegalArgumentException("Field cannot be null");
//         }
	    
// 		this.employeeId = employeeId;
// 		this.firstName = firstName;
// 		this.lastName = lastName;
// 		this.idNumber = idNumber;
// 		this.address = address;
// 		this.dateJoined = dateJoined;
// 		this.isForeigner = isForeigner;
// 		this.isMale = isMale;
		
// 		childNames = new LinkedList<>();
// 		childIdNumbers = new LinkedList<>();
// 	}
	
// 	public void setMonthlySalary(Grade grade) {	
// 		switch(grade) {
// 			case GRADE_1:
// 				monthlySalary = GRADE_1_SALARY;
// 				break;
// 			case GRADE_2:
// 				monthlySalary = GRADE_2_SALARY;
// 				break;
// 			case GRADE_3:
// 				monthlySalary = GRADE_3_SALARY;
// 				break;
// 		}
		
// 		if (isForeigner) {
// 			monthlySalary *= 1.5;
// 		}
// 	}
	
// 	public void setAnnualDeductible(int deductible) {	
// 		this.annualDeductible = deductible;
// 	}
	
	public void setOtherMonthlyIncome(int income) {	
		this.otherMonthlyIncome = income;
	}

	'perubahan nama dari setAdditionalIncome menjadi setOtherMonthlyIncome, 
	saya ganti karena penamaanya jauh lebih jelas ddan dpat dipahami, karena yg sbelumnya sedikit ribet'
	
// 	public void setSpouse(String spouseName, String spouseIdNumber) {
// 		this.spouseName = spouseName;
// 		this.spouseIdNumber = idNumber;
// 	}
	
// 	public void addChild(String childName, String childIdNumber)
// 	childNames.add(childName);
// 	childIdNumbers.add(childIdNumber);
// }

// public int getAnnualIncomeTax() {
// 	int monthWorkingInYear = calculateMonthWorkingInYear();
	
// 	return TaxFunction.calculateTax(monthlySalary, otherMonthlyIncome, monthWorkingInYear, annualDeductible, isSpouseEmpty(), childIdNumbers.size());
// }

// private boolean isSpouseEmpty() {
// 	return spouseIdNumber.equals("");
// }

// private int calculateMonthWorkingInYear() {
// 	LocalDate now = LocalDate.now();
// 	if (now.getYear() == dateJoined.getYear()) {
// 		return now.getMonthValue() - dateJoined.getMonthValue();
// 	} else {
// 		return MONTH_IN_YEAR;
// 	}
// }

// private enum Grade {
// 	GRADE_1, GRADE_2, GRADE_3
// }
>>>>>>> Stashed changes
