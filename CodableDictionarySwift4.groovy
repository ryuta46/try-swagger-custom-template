@Grab('org.openapitools:openapi-generator-cli:4.1.0')
import org.openapitools.codegen.*;
import org.openapitools.codegen.languages.*;
import io.swagger.v3.oas.models.media.ComposedSchema;

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
  
  @Override
  public String toAnyOfName(List<String> names, ComposedSchema composedSchema) {
     return "CodableDictionary";
  }

  public static main(String[] args) {
    OpenAPIGenerator.main(args)
  }
}