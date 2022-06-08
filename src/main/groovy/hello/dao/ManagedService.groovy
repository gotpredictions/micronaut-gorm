package hello.dao
import grails.gorm.annotation.Entity
import groovy.transform.CompileStatic

@CompileStatic
@Entity
class ManagedService {
    String name
    // Date create_time
    // Date update_time
    String metadata
    String description
}
