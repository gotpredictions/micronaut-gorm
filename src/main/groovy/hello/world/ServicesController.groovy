package hello.world

import grails.gorm.transactions.Transactional
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import groovy.json.JsonOutput
import hello.dao.ManagedService
import jakarta.inject.Inject

@Transactional
@Controller("/services")
class ServicesController {

    @Inject ServicesService servicesService

    @Get(uri="/", produces="application/json")
    String index() {
        List services
        services = servicesService.findAll()
        return JsonOutput.toJson(services)
    }
}