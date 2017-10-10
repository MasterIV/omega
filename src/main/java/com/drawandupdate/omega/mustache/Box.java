package com.drawandupdate.omega.mustache;

import com.samskivert.mustache.Mustache;
import com.samskivert.mustache.Template;
import lombok.Getter;
import lombok.Setter;

import java.io.IOException;
import java.io.Writer;

@Getter
@Setter
public class Box extends Fragment {
    private String title;
    private String button;

    public Box(String template, Mustache.Compiler compiler) {
        super(template, compiler);
    }

    @Override
    public void execute(Template.Fragment fragment, Writer writer) throws IOException {
        super.execute(fragment, writer);
        button = null;
    }
}
