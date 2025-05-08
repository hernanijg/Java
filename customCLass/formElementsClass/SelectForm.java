package customCLass.formElementsClass;

import java.util.ArrayList;
import java.util.List;

public class SelectForm extends ElementForm{
    private List<SelectOptions> options;

    public SelectForm(String name) {
        super(name);
        this.options = new ArrayList<>();
    }

    public SelectForm(String name, List<SelectOptions> options) {
        super(name);
        this.options = options;
    }

    public SelectForm addOption(SelectOptions selectOptions){
        this.options.add(selectOptions);
        return this;
    }

    @Override
    public String writeHtml() {
        StringBuilder sb = new StringBuilder("<select ");
        sb.append("name='")
                .append(this.name)
                .append("'>");

        for (SelectOptions option: this.options) {
            sb.append("\n<option value='")
                    .append(option.getValue())
                    .append("'");

            if(option.isSelected()) {
                sb.append(" selected");
                this.value = option.getValue();
            }

            sb.append(">")
                    .append(option.getName())
                    .append("</option>");
        }
        sb.append("</select>");
        return sb.toString();
    }
}
