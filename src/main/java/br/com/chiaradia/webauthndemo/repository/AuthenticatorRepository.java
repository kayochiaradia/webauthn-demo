package br.com.chiaradia.webauthndemo.repository;

import br.com.chiaradia.webauthndemo.entitity.AuthenticatorEntity;
import br.com.chiaradia.webauthndemo.entitity.AppUserEntity;
import com.yubico.webauthn.data.ByteArray;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AuthenticatorRepository extends CrudRepository<AuthenticatorEntity, Long> {
    Optional<AuthenticatorEntity> findByCredentialId(ByteArray credentialId);
    List<AuthenticatorEntity> findAllByUser (AppUserEntity user);
    List<AuthenticatorEntity> findAllByCredentialId(ByteArray credentialId);
}