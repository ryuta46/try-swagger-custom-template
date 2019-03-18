@Grab('io.swagger:swagger-codegen-cli:2.4.2')
import io.swagger.codegen.*;
import io.swagger.codegen.languages.*;

class CodableDictionarySwift4 extends Swift4Codegen {

  String name = "codbale-dictionary-swift4"
  String help = "Swift4 using CodableDicationry instead of Any"

  CodableDictionarySwift4() {
    super()
    this.typeMapping["object"] = "CodableDictionary"
  }

  @Override
  public void processOpts() {
    super.processOpts();
    this.supportingFiles.add(new SupportingFile("CodableDictionary.mustache", sourceFolder, "CodableDictionary.swift"));    
  }

  public static main(String[] args) {
    SwaggerCodegen.main(args)
  }
}