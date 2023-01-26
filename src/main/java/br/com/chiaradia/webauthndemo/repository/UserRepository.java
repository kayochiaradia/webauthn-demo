package br.com.chiaradia.webauthndemo.repository;

import br.com.chiaradia.webauthndemo.entitity.AppUserEntity;
import com.yubico.webauthn.data.ByteArray;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<AppUserEntity, Long> {
    AppUserEntity findByUsername(String name);
    AppUserEntity findByHandle(ByteArray handle);
}
