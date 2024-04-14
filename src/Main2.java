public class Main2 {
    private String fullName;
    private String subjectName;
    private int pageCount;
    private int graduationYear;
    private String coverColor;
    private String institutionName;

    public Main2(String fullName, String subjectName, int pageCount, int year, String coverColor, String institutionName) {
        this.fullName = fullName;
        this.subjectName = subjectName;
        this.pageCount = pageCount;
        this.graduationYear = year;
        this.coverColor = coverColor;
        this.institutionName = institutionName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getYear() {
        return graduationYear;
    }

    public void setYear(int year) {
        this.graduationYear = year;
    }

    public String getCoverColor() {
        return coverColor;
    }

    public void setCoverColor(String coverColor) {
        this.coverColor = coverColor;
    }

    public String getInstitutionName() {
        return institutionName;
    }

    public void setInstitutionName(String institutionName) {
        this.institutionName = institutionName;
    }

    @Override
    public String toString() {
        return "Конспект" +
                "\nПІБ студента = " + fullName.trim() +
                "\nНазва предмету = " + subjectName.trim() +
                "\nКількість сторінок = " + pageCount +
                "\nРік випуску = " + graduationYear +
                "\nКолір обкладинки = " + coverColor.trim() +
                "\nНазва закладу = " + institutionName.trim() +
                "\n";
    }
}

