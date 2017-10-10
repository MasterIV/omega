package com.drawandupdate.omega.mustache;

import com.samskivert.mustache.Mustache;
import com.samskivert.mustache.Template;
import lombok.Getter;
import lombok.Setter;

import java.io.IOException;
import java.io.Writer;

public class Fragment implements Mustache.Lambda {
    @Getter
    private String body;

    private String template;
    private Mustache.Compiler compiler;

    public Fragment(String template, Mustache.Compiler compiler) {
        this.template = template;
        this.compiler = compiler;
    }

    @Override
    public void execute(Template.Fragment fragment, Writer writer) throws IOException {
        body = fragment.execute();
        compiler.compile(template).execute(fragment.context(), writer);
    }
}
