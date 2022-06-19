package com.menorise.newaccount.model

import org.hibernate.annotations.GenericGenerator
import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.OneToMany

@Entity
data class Customer(

        @Id
        @GeneratedValue(generator = "UUID")
        @GenericGenerator(name="UUID", strategy = "org.hibernate.id.UUIDGenerator")
        val id: String?,

        val name: String?,
        val surname: String?,

        @OneToMany(mappedBy = "customer",fetch = FetchType.LAZY)
        val accounts: Set<Account>?
)
{
        override fun equals(other: Any?): Boolean {
                if (this === other) return true
                if (javaClass != other?.javaClass) return false

                other as Customer

                if (id != other.id) return false
                if (name != other.name) return false
                if (surname != other.surname) return false
                if (accounts != other.accounts) return false

                return true
        }

        override fun hashCode(): Int {
                var result = id?.hashCode() ?: 0
                result = 31 * result + (name?.hashCode() ?: 0)
                result = 31 * result + (surname?.hashCode() ?: 0)
                return result
        }
}