import com.company.service.Service;

module servicesImpl {
    requires services;
    provides Service with com.company.service.impl.ServiceImpl;
}