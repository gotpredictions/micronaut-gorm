package hello.world

import hello.dao.ManagedService
import grails.gorm.services.Service
import groovy.transform.CompileStatic
import javax.validation.constraints.NotNull
import jakarta.inject.Singleton

@Singleton
@CompileStatic
@Service(ManagedService)
abstract class ServicesService {
    abstract int count()
    abstract List<ManagedService> findAll()
    abstract List<ManagedService> findAll(Map args)
    abstract ManagedService find(@NotNull Long id)
    abstract ManagedService save(ManagedService service)
    abstract ManagedService delete(@NotNull Long id)
}