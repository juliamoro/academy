package by.academy.homework4;
public enum Week {
    Monday("Понедельник"), Tuesday("Вторник"), Wednesday("Среда"), Thursday("Четверг"),
    Friday("Пятница"), Saturday("Суббота"), Sunday("Воскресенье");
    private String index;

    Week(String index) {
        this.index = index;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }
}
