
#ifndef MELD_OPENMM_CWRAPPER_H_
#define MELD_OPENMM_CWRAPPER_H_

#ifndef OPENMM_EXPORT_MELD
#define OPENMM_EXPORT_MELD
#endif
/* Global Constants */


/* Type Declarations */

#if defined(__cplusplus)
extern "C" {
#endif

/* Type Declarations */

typedef struct OpenMM_MeldForce_struct OpenMM_MeldForce;


/* MeldForce */
extern OPENMM_EXPORT_MELD OpenMM_MeldForce* OpenMM_MeldForce_create();
extern OPENMM_EXPORT_MELD void OpenMM_MeldForce_destroy(OpenMM_MeldForce* target);
extern OPENMM_EXPORT_MELD void OpenMM_MeldForce_addDistanceRestraint(OpenMM_MeldForce* target, 
                               int particle1, int particle2, float r1, float r2, float r3, float r4, float force_constant);
extern OPENMM_EXPORT_MELD void OpenMM_MeldForce_modifyDistanceRestraint(OpenMM_MeldForce* target,
                        int index, int particle1, int particle2, float r1, float r2, float r3, float r4, float force_constant);
extern OPENMM_EXPORT_MELD int OpenMM_MeldForce_addHyperbolicDistanceRestraint(OpenMM_MeldForce* target,
                       int particle1, int particle2, float r1, float r2, float r3, float r4, float force_constant, float asymptote);
extern OPENMM_EXPORT_MELD void OpenMM_MeldForce_modifyHyperbolicDistanceRestraint(OpenMM_MeldForce* target,
                       int index, int particle1, int particle2, float r1, float r2, float r3, float r4, float force_constant, float asymptote);
extern OPENMM_EXPORT_MELD int OpenMM_MeldForce_addTorsionRestraint(OpenMM_MeldForce* target,
                       int atom1, int atom2, int atom3, int atom4, float phi, float deltaPhi, float forceConstant);
extern OPENMM_EXPORT_MELD void OpenMM_MeldForce_modifyTorsionRestraint(OpenMM_MeldForce* target,
                        int index, int atom1, int atom2, int atom3, int atom4, float phi, float deltaPhi, float forceConstant);

#if defined(__cplusplus)
}
#endif

#endif /*MELD_OPENMM_CWRAPPER_H_*/

