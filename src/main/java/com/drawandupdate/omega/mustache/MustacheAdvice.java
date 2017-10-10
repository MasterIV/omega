package com.drawandupdate.omega.mustache;

import com.samskivert.mustache.Mustache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

@ControllerAdvice
public class MustacheAdvice {
    private final Mustache.Compiler compiler;

    @Autowired
    public MustacheAdvice(Mustache.Compiler compiler) {
        this.compiler = compiler;
    }

    @ModelAttribute("box")
    public Mustache.Lambda box() {
        return new Box("{{>box}}", compiler);
    }

    @ModelAttribute("layout")
    public Mustache.Lambda layout() {
        return new Fragment("{{>layout}}", compiler);
    }

    @ModelAttribute("title")
    public Mustache.Lambda title(@ModelAttribute Box box) {
        return (frag, out) -> box.setTitle(frag.execute());
    }

    @ModelAttribute("button")
    public Mustache.Lambda button(@ModelAttribute Box box) {
        return (frag, out) -> box.setButton(frag.execute());
    }
}
