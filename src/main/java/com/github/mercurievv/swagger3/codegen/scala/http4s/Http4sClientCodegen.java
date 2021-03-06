package com.github.mercurievv.swagger3.codegen.scala.http4s;

import io.swagger.codegen.v3.CodegenType;

/**
 * Created with IntelliJ IDEA.
 * User: Victor Mercurievv
 * Date: 2/11/2019
 * Time: 8:56 PM
 * Contacts: email: mercurievvss@gmail.com Skype: 'grobokopytoff' or 'mercurievv'
 */
public class Http4sClientCodegen extends Http4sCodegen {
    @Override
    public String getDefaultTemplateDir() {
        return "scala/http4s-client";
    }

    @Override
    public CodegenType getTag() {
        return CodegenType.CLIENT;
    }

    @Override
    public String getName() {
        return "scala-htttp4s-server";
    }
}
