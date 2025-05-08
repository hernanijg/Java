package customCLass.formElementsClass;

public class TextareaForm extends ElementForm {
    private int columns;
    private int rows;

    public TextareaForm(String name) {
        super(name);
    }

    public TextareaForm(String name, int columns, int rows) {
        super(name);
        this.columns = columns;
        this.rows = rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    @Override
    public String writeHtml() {
        return "<textarea name='" + this.name +
                "' cols='" + this.columns +
                "' rows='" + this.rows +
                "'>" + this.value + "</textarea>";
    }
}
